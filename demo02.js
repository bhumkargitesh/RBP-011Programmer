function generateFibonacciSeries(n) {
    const fibonacciSeries = [0, 1];
    
    for (let i = 2; i < n; i++) {
      const nextTerm = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
      fibonacciSeries.push(nextTerm);n
    }
    
    return fibonacciSeries;
  }
  
  const n = 10; // Change this to the number of terms you want in the series
  const series = generateFibonacciSeries(n);
  console.log(series);