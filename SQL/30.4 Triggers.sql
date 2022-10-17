CREATE TABLE BOOKS_AUD (
                           EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
                           EVENT_DATE DATETIME NOT NULL,
                           EVENT_TYPE VARCHAR(10) NOT NULL,
                           BOOK_ID INT(11) NOT NULL,
                           OLD_TITLE VARCHAR(25),
                           NEW_TITLE VARCHAR(25),
                           OLD_PUBYEAR INT(4),
                           NEW_PUBYEAR INT(4),
                           NEW_BESTSELLER BOOLEAN,
                           OLD_BESTSELLER BOOLEAN,
                           PRIMARY KEY (EVENT_ID)
);

CREATE TABLE READERS_AUD (
                             EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
                             EVENT_DATE DATETIME NOT NULL,
                             EVENT_TYPE VARCHAR(10) NOT NULL,
                             READER_ID INT(11) NOT NULL,
                             OLD_FIRSTNAME VARCHAR(20),
                             NEW_FIRSTNAME VARCHAR(20),
                             OLD_LASTNAME VARCHAR(20),
                             NEW_LASTNAME VARCHAR(20),
                             OLD_PESELID BIGINT(11),
                             NEW_PESELID BIGINT(11),
                             OLD_VIP_LEVEL VARCHAR(20),
                             NEW_VIP_LEVEL VARCHAR(20),
                             PRIMARY KEY (EVENT_ID)
);


DELIMITER $$
CREATE TRIGGER BOOKS_INSERT AFTER INSERT ON BOOKS
    FOR EACH ROW
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID, NEW_TITLE,
                           NEW_PUBYEAR, NEW_BESTSELLER)
        VALUE (CURTIME(), 'INSERT', NEW.BOOK_ID, NEW.TITLE, NEW.PUBYEAR,
                  NEW.BESTSELLER);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER BOOKS_DELETE AFTER DELETE ON BOOKS
    FOR EACH ROW
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID)
        VALUE (CURTIME(), 'DELETE', OLD.BOOK_ID);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER BOOKS_UPDATE AFTER UPDATE ON BOOKS
    FOR EACH ROW
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID, OLD_TITLE,
                           NEW_TITLE, OLD_PUBYEAR, NEW_PUBYEAR, NEW_BESTSELLER,
                           OLD_BESTSELLER)
        VALUE (CURTIME(), 'UPDATE', NEW.BOOK_ID, OLD.TITLE, NEW.TITLE,
                  OLD.PUBYEAR, NEW.PUBYEAR, NEW.BESTSELLER, OLD.BESTSELLER);
END $$
DELIMITER ;


DELIMITER $$
CREATE TRIGGER READERS_INSERT AFTER INSERT ON READERS
    FOR EACH ROW
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID, NEW_FIRSTNAME,
                             NEW_LASTNAME, NEW_PESELID, NEW_VIP_LEVEL)
        VALUE (CURTIME(), 'INSERT', NEW.READER_ID, NEW.FIRSTNAME, NEW.LASTNAME,
                  NEW.PESELID, NEW.VIP_LEVEL);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER READERS_DELETE AFTER DELETE ON READERS
    FOR EACH ROW
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID)
        VALUE (CURTIME(), 'DELETE', OLD.READER_ID);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER READERS_UPDATE AFTER UPDATE ON READERS
    FOR EACH ROW
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID, OLD_FIRSTNAME,
                             NEW_FIRSTNAME, OLD_LASTNAME, NEW_LASTNAME,
                             OLD_PESELID, NEW_PESELID, OLD_VIP_LEVEL, NEW_VIP_LEVEL)
        VALUE (CURTIME(), 'UPDATE', NEW.READER_ID, OLD.FIRSTNAME, NEW.FIRSTNAME,
                  OLD.LASTNAME, NEW.LASTNAME, OLD.PESELID, NEW.PESELID, OLD.VIP_LEVEL,
                  NEW.VIP_LEVEL);
END $$
DELIMITER ;