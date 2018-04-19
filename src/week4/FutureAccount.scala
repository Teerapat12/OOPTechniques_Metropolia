package week4

import java.util.concurrent.locks.ReentrantLock

import scala.concurrent.Future

class FutureAccount(private val account_holder: String = "no name", private var balance: Double = 0, private val remaining_credit: Double = 100) {

  val a_lock = new ReentrantLock()

  def this(credits: Double){this("no name", credits)}  // What's the different between ){} and )={}

  def withdraw(withdraw_money: Double): Boolean = {

    // Lock
    Future {
      a_lock.lock()
      if (withdraw_money > balance) {
        a_lock.unlock()
      }
      else {
        this.balance = this.balance - withdraw_money
        a_lock.unlock()
      }
    }
    true
  }

  def deposit(dep_money: Double): Boolean = {
    // Lock
    Future {
      a_lock.lock()
      this.balance += dep_money
      a_lock.unlock()
    }
    true
  }

  def status() = {
    println(s"Back account of ${this.account_holder} has a balacne of ${this.balance} and remaining credits of ${this.remaining_credit}")
  }
  
}
