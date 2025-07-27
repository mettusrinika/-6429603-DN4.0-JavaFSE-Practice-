CREATE OR REPLACE PROCEDURE TransferFunds (
       src_account IN NUMBER,
       dest_account IN NUMBER,
       amount IN NUMBER
) IS
       src_balance NUMBER;
BEGIN
  SELECT Balance INTO src_balance FROM Accounts WHERE AccountID = src_account FOR UPDATE;

  IF src_balance < amount THEN
       RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  
   END IF;
   
   UPDATE Accounts
   SET Balance = Balance - amount,
       LastModified = SYSDATE
   WHERE AccountID = src_account;
 
   UPDATE Accounts
   SET Balance = Balance + amount,
       LastModified = SYSDATE
   WHERE AccountID = dest_account;

   COMMIT;

END;
/

