/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {

    s = s.toLowerCase();

    s = s.replace(/[^a-z0-9]/g, "");

    let reversed = "";

    for (let i = s.length - 1; i >= 0; i--) {
        reversed += s[i];
    }
    
    return reversed === s;
};