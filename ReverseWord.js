function reverseString(str){
    return str.split('').reverse().join('');
}
const inputString = "hsetiG";
const reversedString = reverseString(inputString);
console.log(reversedString);