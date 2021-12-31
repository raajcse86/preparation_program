package com.test.bst;
class Hold{
    int startIndex;
    int endIndex;
    int max;

    Hold(int startIndex, int endIndex, int max){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.max = max;
    }
}

public class TestProgram {

    public static void main(String[] args) {
        int[] a = {-3,-2,4,1,-1,5,-3};
        int l=0;
        int r=0;
        int max_sum_so_far =a[0];
        int sum=a[0];
        Hold h = null;

        int prevMaxSumSoFar=0;
        while(l <a.length && r<a.length-1){
            r++;
            sum+=a[r];
            max_sum_so_far = Math.max(sum,max_sum_so_far);
            if(max_sum_so_far >= 0){
                    h= new Hold(l,r,max_sum_so_far);
            }else{
                l++;
                r++;
                sum=0;
                for(int i=l;i<=r;i++){
                    sum+=a[i];
                }
                max_sum_so_far = Math.max(sum,max_sum_so_far);

                if(max_sum_so_far >=0 && prevMaxSumSoFar<max_sum_so_far){
                    prevMaxSumSoFar = max_sum_so_far;
                    h= new Hold(l,r,max_sum_so_far);
                }
            }
        }

        System.out.println("StartIndex-- "+h.startIndex+"--Max -- "+h.max+"--End Index --"+h.endIndex);










    }

}
