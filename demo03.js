function isPerfectNumber(number) {
    let sum = 0;
    
    for (let i = 1; i <= number / 2; i++) {
      if (number % i === 0) {
        sum += i;
      }
    }
    
    return sum === number;
  }
  
  const numberToCheck = 28; // Change this to the number you want to check
  if (isPerfectNumber(numberToCheck)) {
    console.log(`${numberToCheck} is a perfect number.`);
  } else {
    console.log(`${numberToCheck} is not a perfect number.`);
  }