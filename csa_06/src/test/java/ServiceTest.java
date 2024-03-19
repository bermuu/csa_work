import Mapper.AccountMapper;
import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServiceTest {


    public class AccountServiceTest {
        private InputStream inputStream;
        private SqlSession sqlSession;
        private AccountMapper accountMapper;

        public AccountServiceTest() throws IOException {
            String resource = "mybatis-confing.xml";
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            accountMapper = sqlSession.getMapper(AccountMapper.class);
        }
        @Test
        public void destory(){
            try{
                sqlSession.commit();
                sqlSession.close();
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        @Test
        public List<Account> findAll(){
            return accountMapper.findAll();
        }
        @Test

        public int deleteByPrimaryKey(String id){
            int line = accountMapper.deleteByPrimaryKey(id);
            System.out.println("账户为"+id+"的数据已经被删除");
            return line;
        }
        @Test
        public int insert(Account record){
            int line = accountMapper.insert(record);
            return line;
        }
        @Test
        public Account selectByPrimaryKey(String id){
            Account selectBoy = new Account();
            selectBoy = accountMapper.selectByPrimaryKey(id);
            return selectBoy;
        }
        @Test
        public int updateByPrimaryKey(Account account){
            int line = accountMapper.updateByPrimaryKey(account);
            return line;
        }
        @Test
        public void transfer(String remitterId,String remitteeId,int remoney){
            Account remitter = accountMapper.selectByPrimaryKey(remitterId);
            Account remittee = accountMapper.selectByPrimaryKey(remitteeId);
            if (remitter == null || remittee == null) {
                System.out.println("账户不存在，转账失败");
                return;
            }

            // 检查转账人余额是否足够
            if (remitter.getMoney() < remoney) {
                System.out.println("转账人余额不足，转账失败");
                return;
            }

            // 更新转账人和收款人的余额
            remitter.setMoney(remitter.getMoney()-remoney);
            remittee.setMoney(remitter.getMoney()+remoney);

            // 更新数据库中的账户信息
            accountMapper.updateByPrimaryKey(remitter);
            accountMapper.updateByPrimaryKey(remittee);

            System.out.println("转账成功：从账户" + remitterId + "转出" + remoney + "给账户" + remitteeId);

        }
    }

}
