package leiwenchang

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Administrator on 2017/7/29.
  */
object hello {
  def main(args: Array[String]) {
    val sparkconf = new SparkConf().setMaster("local").setAppName("hello")
    val sc = new SparkContext(sparkconf)
    val rdd=sc.parallelize(Array(1,2,3))
    println(rdd.count())
    println("hello")
  }
}
