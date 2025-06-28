DECLARE
    CURSOR cust_loan_cursor IS
    SELECT c.CustomerID, c.DOB, l.LoanID, l.InteresrRate
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID;

    v_age NUMBER;
BEGIN
    FOR rec IN cust_loan_cursor LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12);

        IF v_age > 60 THEN
            UPDATE Loans
                SET InterestRate = rec.InteresrRate - 1
            WHERE LoanID = rec.LoanID;
        end if;

        end loop;

    COMMIT;
end;
/