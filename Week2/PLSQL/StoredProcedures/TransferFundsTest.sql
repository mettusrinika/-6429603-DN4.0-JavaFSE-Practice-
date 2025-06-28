EXEC TransferFunds(1, 2, 200);

SELECT * FROM Accounts WHERE AccountID IN (1, 2);