import domain.Account;
import org.example.AccountService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoTest {
    public static void main(String[] args) throws IOException {
        AccountService a1 = new AccountService();
        List<Account> account = new ArrayList<>();
        account = a1.findAll();
        System.out.println(account);
        //2.
        /*
         * 删除id为0010的账户
         * */
        int line = a1.deleteByPrimaryKey("0010");
        System.out.println("受影响的行数是"+line);
        account = a1.findAll();
        System.out.println(account);
        //3.
        /*
         * 添加新账户
         * id:0112,name:中国工商银行,money:10000000,createtime:'2004-04-28',updatetime:'2013-06-17'
         * */
        Account new_account = new Account();
        new_account.setId("0122");
        new_account.setName("中国工商银行");
        new_account.setMoney(10000000);
        new_account.setCreatetime("2004-04-28");
        new_account.setUpdatetime("2013-06-17");
        a1.insert(new_account);
        System.out.println(a1.findAll());
        //4.
        /*
         * 查找id是0112的账户
         * */
        Account selboy = new Account();
        selboy = a1.selectByPrimaryKey("0122");
        System.out.println(selboy);
        //5.
        /*
         *更新id是0112的账户,修改money为50000000
         * */
        Account acc = new Account();
        acc.setId("0112");
        acc.setMoney(50000000);
        line = a1.updateByPrimaryKey(acc);
        System.out.println("受影响的行数是"+line);
        selboy = a1.selectByPrimaryKey("0122");
        System.out.println(selboy);
        //6.
        /*
         * 0122给0111转账，金额是50000000*/

        a1.transfer("0122","0111",50000000);
        System.out.println("转账后");
        selboy = a1.selectByPrimaryKey("0122");
        System.out.println(selboy);
        selboy = a1.selectByPrimaryKey("0111");
        System.out.println(selboy);
        a1.destory();
    }
}
