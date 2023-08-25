function isPrime(m){
if (m <= 1)
return false;

// Check from 2 to m-1
for (let i = 2; i < m; i++)
if (m % i == 0)
    return false;

return true;
}

// Driver Code

isPrime(17) 
    ?console.log("true, it is a prime number") 
    :console.log("false,it is not prime number");
