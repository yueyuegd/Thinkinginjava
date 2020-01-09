package concurrency;

/**
 * @author zhangyue95
 * @date 2019/10/9.
 */
public class Account {

    // 锁：保护账户余额
    private final Object balLock = new Object();
    //账户余额
    private Integer balance;
    //锁：保护账号密码
    private final Object pwLock = new Object();
    //账户密码
    private String password;

    //取款
    void withdraw(Integer amt) {
        synchronized (balLock) {
            if (balance > amt) {
                balance -= amt;
            }
        }
    }

    //查看余额
    Integer getBalance() {
        synchronized (balLock) {
            return balance;
        }
    }

    //更改密码
    void updatePassword(String pwd) {
        synchronized (pwLock) {
            this.password = pwd;
        }
    }

    //查看密码
    String getPassword() {
        synchronized (pwLock) {
            return password;
        }
    }
}
