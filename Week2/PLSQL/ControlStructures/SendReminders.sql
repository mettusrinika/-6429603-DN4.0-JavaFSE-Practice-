BEGIN
   FOR rec IN (
       SELECT l.LoanID, l.CustomerID, l.EndDate, c.Name
       FROM Loans l
       JOIN Customers c ON l.CustomerID = c.CustomerID
       WHERE l.EndDate <= SYSDATE + 30
   ) LOOP
       DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID '|| rec.LoanID || 'for' || rec.name || 'is due on' || TO_CHAR(rec.endDate, 'DD-MM-YYY'));
     END LOOP;
END;
/ 