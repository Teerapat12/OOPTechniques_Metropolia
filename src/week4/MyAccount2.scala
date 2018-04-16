package week4

import java.util.concurrent.locks.{ReentrantLock, ReentrantReadWriteLock}

class MyAccount2(private val account_holder: String = "no name", private var balance: Double = 0, private val remaining_credit: Double = 100) {

  val lock = new ReentrantReadWriteLock
  val r_lock = lock.readLock()
  val w_lock = lock.writeLock()

  def this(credits: Double){this("no name", credits)}  // What's the different between ){} and )={}

  def withdraw(withdraw_money: Double): Boolean = {

    // Lock
    r_lock.lock()
    if(withdraw_money > balance){
      r_lock.unlock()
      false
    }
    else {
      r_lock.unlock()
      w_lock.lock()
      this.balance =  this.balance - withdraw_money
      w_lock.unlock()
      true
    }
  }

  def deposit(dep_money: Double): Boolean = {
    // Lock
    w_lock.lock()
    this.balance += dep_money
    w_lock.unlock()
    true
  }

  def status() = {
    r_lock.lock()
    println(s"Back account of ${this.account_holder} has a balacne of ${this.balance} and remaining credits of ${this.remaining_credit}")
    r_lock.unlock()
  }

}
