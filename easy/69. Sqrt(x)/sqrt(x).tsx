function mySqrt(x: number): number {
    let left: number = 0;
    let right: number = x;

    while (left <= right){
        let mid: number = Math.floor((left + right) / 2);
        if(mid**2 > x){
            right = mid - 1;
        }else{
            left = mid + 1;
        }
    }

    return right;
};