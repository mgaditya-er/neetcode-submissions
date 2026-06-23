class Solution {
    public int reverseBits(int n) {
        
        // int res=0;
        // for(int i=0;i<32;i++){
        //     res=res<<1;
        //     res |= (n&1);
        //     n >>=1;
        // }
        // return res;
        int res = 0;
        for(int i = 0; i < 32; i++){
            int lastBit = n & 1;
            n = n >> 1;
            res = res << 1;
            res = res | lastBit;
            // System.out.println(res);
        }
        return res;
    }
}
