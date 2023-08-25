function isPrime(number) {
    if (number <= 1) {
        return false;
    }

    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            return false;
        }
    }

    return true;
}

function findPrimeNumbersInArray(arr) {
    const primeNumbers = [];

    for (const num of arr) {
        if (isPrime(num)) {
            primeNumbers.push(num);
        }
    }

    return primeNumbers;
}

const numbersArray = [7, 12, 5, 23, 8, 11, 15]; // Replace with your array of numbers
const primeNumbersArray = findPrimeNumbersInArray(numbersArray);

console.log("Prime numbers in the array:", primeNumbersArray);
