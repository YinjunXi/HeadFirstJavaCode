package Code;

/**
 * Created by yangxi on 2017/2/10.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end",
                //                       多层                                            前端
                                "web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
                //                            普遍的                           关键路径
        String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered",
                //                授权        粘性的     增值的          面向       中心的       分布式的        聚合的
                                "branded","outside-the-box","positioned","networked","focused","leveraged","aligned",
                //                  品牌      创新之举            定位          网络的     聚焦         杠杆的      对齐的
                                "targeted","shared","cooperative","accelerated"};
                //                  定向的               合作的           加速的
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy",
                //                  过程           倾斜点                     架构         核心竞争力           策略
                                "mindshare","portal","space","vision","paradigm","mission"};
                //                  份额        入口                        范例      任务

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);

    }


}
