
Construct a SQL query to display the names and balances of people who have a balance greater than $10,000.
 The balance of an account is equal to the sum of the amounts of all transactions involving that account.
  You can return the result table in any order.




Input:

Users table:
Account_number	name
12300001	Ram
12300002	Tim
12300003	Shyam


Transactions table:
trans_id	account_number	amount	transacted_on
1	12300001	8000	2022-03-01
2	12300001	8000	2022-03-01
3	12300001	-3000	2022-03-02
4	12300002	4000	2022-03-12
5	12300003	7000	2022-02-07
6	12300003	7000	2022-03-07
7	12300003	-4000	2022-03-11


select u.name, t.amount from Users as u inner join Transactions as t  on u.Account_number = t.account_number group by account_number having sum(t.amount) > 10000;
