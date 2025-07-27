1. Purpose of the Assignment 
    The purpose of this assignment is to practice basic conditional logic and control structures in Java. The task is split into two parts. 
    1. Calculating the average of three test scores and determining the corresponding letter grade using else if logic. 
    2. Calculating monthly bank charges based on how many checks were written, using conditional logic to apply the appropriate per-check rate.
2. Description of the Java Code 
    1. Part 1
        The program prompts the user to input three integer test scores 
        It calculates the average of the scores and displays the letter grade
        Control structures like if, else if and else are used to evaluate the correct grade range 
    2. Part 2
        The program asks the user how many checks were written during the month 
        A base monthly fee of $10 is always applied 
        Depending on the number of checks, the program calculates the per-check fee
        The total service charge is calculated by combining the base fee and check-based fees 
3. Sample input/output
    1. Part 1
        Enter score 1: 90
        Enter score 2: 90
        Enter score 3: 90
        Average: 90.0
        Grade: A
    2. Part 2
        Enter number of checks: 40
        Base fee: $10.00
        Fee per check: $0.06
        Total service charge: $12.4
4. Challenges Faced
    Ensuring that average calculation uses floating-point division instead of integer division 
    Applying clean and correct logic in else if branches for both grade and fee tiering