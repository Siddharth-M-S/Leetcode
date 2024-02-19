bool isPowerOfTwo(int n) {
    if(n==1){
        return true;
    }else if(n<=0){
        return false;
    }
    if(n%2!=0){
        return false;

    }
    // printf(n);
    return isPowerOfTwo(n/2);
    
}