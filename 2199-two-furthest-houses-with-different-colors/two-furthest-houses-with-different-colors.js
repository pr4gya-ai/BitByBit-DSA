/**
 * @param {number[]} colors
 * @return {number}
 */
var maxDistance = function(colors) {

    let maxDistance = 0;

    for (let i = 0; i < colors.length; i++) {

        for (let j = colors.length - 1; j > i; j--) {

            if (colors[i] !== colors[j]) {

                maxDistance = Math.max(maxDistance, j - i);

            }

        }
    }

    return maxDistance;
};