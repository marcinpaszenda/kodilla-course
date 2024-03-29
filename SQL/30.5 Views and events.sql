CREATE TABLE STATS (
                       STAT_ID INT(11) AUTO_INCREMENT,
                       STAT_DATE DATETIME NOT NULL,
                       STAT VARCHAR(20) NOT NULL,
                       VALUE INT(11) NOT NULL,
                       PRIMARY KEY (STAT_ID)
);

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(*) AS BESTSELLER_QUANTITY
FROM BOOKS WHERE BESTSELLER = 1;

SELECT * FROM BESTSELLERS_COUNT;

USE BAZA_DANYCH_KURS_KODILLA;

DELIMITER $$
CREATE EVENT UPDATE_BESTSELLER
    ON SCHEDULE EVERY 1 MINUTE
    DO
BEGIN
CALL UpdateBestsellers();
INSERT INTO STATS (STAT_DATE, STAT, VALUE)
VALUES (CURTIME(), 'BESTSELLERS', (SELECT * FROM BESTSELLERS_COUNT));
END $$
DELIMITER ;

SELECT * FROM STATS;

DROP EVENT UPDATE_BESTSELLER;

