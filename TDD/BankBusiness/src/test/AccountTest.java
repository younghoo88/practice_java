package test;

import static org.junit.Assert.*;
import main.Account;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

  Account account;
  
  @Before
  public void setup() {
	account = new Account(10000);
  }
  
  /**
   * 계좌 정상 생성 여부 테스트
   * 계좌는 기본적으로 돈을 입금해야 생성이 된다.
   */
  @Test
  public void testAccount() {
    setup();
  }

  /**
   * 잔액 조회 테스트
   * 참고사항 : Test 입력 후 assistance shortcut 연속 두번 누르면 자동 완성됨.
   */
  @Test
  public void testGetBalance() throws Exception {
    setup();
    assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());
    
    account = new Account(1000);
    assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());
  }
  
  /**
   * 입금 및 출금 테스트
   */
  @Test
  public void testDeposit() throws Exception {
    setup();
    account.deposit(1000);
    assertEquals("계좌 생성 시 10000원 입금 후, 1000원 입금", 11000, account.getBalance());
  }
  
  @Test
  public void testWithdraw() throws Exception {
    setup();
    account.withdraw(1000);
    assertEquals("계좌 생성 시 10000원 입금 후, 1000원 출금", 9000, account.getBalance());
  }
}
