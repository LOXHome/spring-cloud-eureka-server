package cn.szxw.git;

public class FirstGit {
    public static void main(String[] args) {
        System.out.println("hello,git");
        FirstGit firstGit=new FirstGit();
        firstGit.gitTest();
        //修改过了
        //master输了
    }

    public  void gitTest(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
