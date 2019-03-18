package cn.tf.pattern.decorator.login.old;


public interface ISigninService {
    ResultMsg regist(String username, String password);

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
