function printNumbers(k){
    if(k <=100){
        console.log(k);
        printNumbers(k + 1);
    }
}
printNumbers(1);
