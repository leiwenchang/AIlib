package leiwenchang

/**
  * Created by Administrator on 2017/7/29.
  */
import org.apache.spark.{SparkConf, SparkContext}

object test {
  def main(args: Array[String]) {
    val sparkconf = new SparkConf().setMaster("local").setAppName("hello")
    val sc = new SparkContext(sparkconf)
    val rdd=sc.parallelize(Array(1,2,3))
    println(rdd.count())
    println("hello")
  }
}
