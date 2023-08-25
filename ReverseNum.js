function reverseNumber(number) {
    let reversed = 0;
  
    while (number !== 0) {
      const remainder = number % 10;
      reversed = reversed * 10 + remainder;
      number = Math.floor(number / 10);
    }
  
    return reversed;
  }
  
  const numToReverse = 12345; // Change this to the number you want to reverse
  const reversedNumber = reverseNumber(numToReverse);
  console.log(`Reversed number: ${reversedNumber}`);