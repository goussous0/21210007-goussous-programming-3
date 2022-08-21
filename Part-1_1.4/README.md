this is an xo 


a user wins in one of three cases 
 
case 1
    all the numbers in the same column are of the same symbol (x,o)

    x o o
    x x o
    x o o 
    ^

case 2 
    all the numbers in the same row are of the same symbol (x,o)

    o o x
    x x x < 
    o x o 

case 3 
    the diagonals are of the same symbol (x,o)

    x o x
    o x o
    o o x 

    

the game starts by creating an empty 2D array (matrix) of size 3*3

then player 1 is asked to input the coordinates 
    if player chooses an already taken slot then he is prompted to enter another coordinates 

next player 2 is asked to input the coordinates
    if player chooses an already taken slot then he is prompted to enter another coordinates 
    

a nested loop checks each row, column for a 3 symbols of the same type 
    if found 
        print the player that has that symbol 
    else 
        check the diagonals 
            if found 
                print the player that has that symbol 
            

Resources:
https://stackoverflow.com/questions/15613626/scanner-is-never-closed
https://www.javatpoint.com/how-to-clear-screen-in-java
https://www.w3schools.com/java/java_user_input.asp