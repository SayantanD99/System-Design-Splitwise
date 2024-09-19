# System-Design-Splitwise

This repository contains a simplified version of Splitwise system, an easy to split bills with friends and family.

## Design Splitwise

### Requirements :

- Users can register and update their profiles.
- A user's profile should contain at least their name, phone number and password
- Users can participate in expenses with other users
- Users can participate in groups.
- To add an expense, a user must specify either the group, or the other users involved in the expense, along with who paid what and who owes what. They must also specify a description for the expense.
- A user can see their total owed amount
- A user can see a history of the expenses they're involved in
- A user can see a history of the expenses made in a group that they're participating in
- Users shouldn't be able to query about groups they are not a member of
- Only the user who has created a group can add/remove members to the group
- Users can request a settle-up. The application should show a list of transactions, which when executed will ensure that the user no longer owes or recieves money from any other user. 
Note that this need not settle-up any other users.
- Users can request a settle-up for any group they're participating in. The application should show a list of transactions, which if executed, will ensure that everyone participating in the group is settled up (owes a net of 0 Rs). 
Note that will only deal with the expenses made inside that group. Expenses outside the group need not be settled.
- When settling a group, we should try to minimize the number of transactions that the group members should make to settle up.

### Class Diagram :

> User
  - name
  - username
  - email
  - password
    
> Expense
  - description
  - amount
  - currency
  - createdAt
  - Participants
  - paidBy
  - paidFor
  - Group
    
> Group
  - name
  - Members
  - Admins
  - CreatedBy

### Schema Diagram :

> User - USERS
  - id
  - name
  - username
  - email
  - password
    
> Expense - EXPENSES
  - id - PK
  - description - VARCHAR(255)
  - amount - DOUBLE
  - currency - VARCHAR(3)
  - createdAt - DATETIME
  - groupId - FK
    
> Group - GROUPS
  - id - PK
  - name - VARCHAR(255)
  - createdBy - FK
  - createdAt - DATETIME
    
> Mapping - GROUP_MEMBERS
  - groupId - FK
  - userId - FK
    
> Mapping - GROUP_ADMINS
  - groupId - FK
  - userId - FK
    
> Mapping - EXPENSE_PARTICIPANTS
  - expenseId - FK
  - userId - FK

<img width="501" alt="Screenshot 2024-09-19 at 09 15 17" src="https://github.com/user-attachments/assets/920df870-c673-4ed2-a95e-1e237a3c6a2f">

### Technologies Used

- **Spring Boot**: For creating stand-alone, production-grade Spring-based applications.
- **Java**: As the main programming language.
- **Model-View-Controller (MVC)**: For separating the application's concerns.
