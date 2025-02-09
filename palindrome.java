public class palindrome {
    static int rev(int n, int revn){
    if(n<10){
        return revn*10+n;
    }
else {
    int last_dig=n%10;
    revn= revn*10+last_dig;
    return rev(n/10,revn);

    }

    }
    public static void main(String[] args) {
    int n=132231;
    int rev=rev(n,0);
        System.out.println("revers" + rev);
if(n==rev){
    System.out.println("palindrom");
}
else {
    System.out.println("is not a palindrom");
}
    }

}
