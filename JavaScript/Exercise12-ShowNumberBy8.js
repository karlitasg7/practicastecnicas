/*

Requirement: Given a number show all the numbers from that number to 0, show all 8 by 8 in a list with dash and each number start with no.

Test Cases:
    showUntil0(100); // should returns:
                    - no. 100
                    - no. 92
                    - no. 84
                    - no. 76
                    - no. 68
                    - no. 60
                    - no. 52
                    - no. 44
                    - no. 36
                    - no. 28
                    - no. 20
                    - no. 12
                    - no. 4

Steps:
    - create a function that receives a number
    - create a for loop from number to 0, increment by 8
    - inside the for print the - no. {number}

*/

function showUntil0(number) {
    for (let i = number; i > -1; i -= 8) {
        console.log(`- no. ${i}`);
    }
}

showUntil0(100);
