package parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import order.Order;

/**
 * Created by jerry on 11/6/17.
 */
public class ParserV2Test extends TestCase {
    private static String testStr = "{\"activityType\":1,\"activityTypeEnum\":\"NONE\",\"bizCategory\":\"COMMON\",\"buyerDTO\":{\"beneficiary\":\"17674105280\",\"buyerId\":188826798,\"fansId\":1391576145,\"fansType\":9},\"channelType\":\"YOUZAN\",\"closeReason\":\"\",\"closeType\":\"NORMAL\",\"closeTypeValue\":0,\"consumeStatus\":\"\",\"contractId\":1421903048609897305,\"createTime\":1513759892671,\"expiredTime\":1513763492671,\"extra\":{\"FANS\":\"{\\\"fansId\\\":1391576145,\\\"type\\\":9,\\\"fansNickName\\\":\\\"\\\",\\\"youzanFansId\\\":1391576145}\",\"payTool\":\"NOW_PAY,OFFLINE_CASH\",\"FROM_CART\":\"true\",\"srcEnv\":\"prod\",\"ORDER_TYPE\":\"0\",\"IS_POINTS_ORDER\":\"0\",\"TOURIST\":\"YZ393071005771460608YZA1HEp15j\",\"group_key\":\"2a3228b8-ee78-47bc-8612-dc898bf57788\"},\"goodsType\":0,\"goodsTypeEnum\":\"COMMON\",\"id\":1421903048609897305,\"logisticsDTO\":{\"address\":{\"addressId\":90729134,\"areaCode\":\"430111\",\"city\":\"长沙市\",\"detail\":\"050县道附近 长沙航空职业技术学院(跳马校区)4-2-601\",\"district\":\"雨花区\",\"lat\":28.037040061358876,\"lon\":113.05383507914966,\"postalCode\":\"\",\"province\":\"湖南省\",\"street\":\"\"},\"logisticsType\":\"NORMAL_EXPRESS\",\"receiverName\":\"刘星宇\",\"receiverTel\":\"17674105280\"},\"memo\":\"\",\"orderId\":1421903048609897305,\"orderItemDTOGroup\":[{\"extra\":{\"DELIVER_TIME\":\"0\",\"DELIVER_OPTION\":\"0\",\"USED_PRO\":\"{\\\"activityAlias\\\":\\\"\\\",\\\"activityId\\\":0,\\\"activityType\\\":\\\"1\\\"}\",\"BIZ_TRACE_POINT\":\"{\\\"cartCreateTime\\\":1513264512,\\\"cartUpdateTime\\\":1513565519,\\\"pageSource\\\":\\\"\\\",\\\"kdtSessionId\\\":\\\"YZ393071005771460608YZA1HEp15j\\\",\\\"extension\\\":{\\\"biz\\\":\\\"wsc\\\",\\\"client\\\":\\\"micromessenger/6.5.23.1180\\\",\\\"dc_ps\\\":\\\"\\\",\\\"platform\\\":\\\"h5\\\"}}\",\"FRONT_PRICE\":\"200\",\"POINTS_PRICE\":\"0\"},\"goodsInfo\":{\"alias\":\"362zerat7wn7i\",\"buy_way\":1,\"class1\":8,\"class2\":\"8-17\",\"extra\":{\"weight\":0.0},\"goods_id\":401183273,\"goods_no\":\"01\",\"img_url\":\"https://img.yzcdn.cn/upload_files/2017/12/05/FvfocHd14iFJngKMYDXNg6gPB6Sw.jpg\",\"is_virtual\":0,\"mark\":0,\"points_price\":0,\"quota\":0,\"storeDeliverySet\":[\"NORMAL_EXPRESS\"],\"supplier_goods_id\":0,\"supplier_kdt_id\":0,\"title\":\"美的滚筒水洗洗衣(一桶)(12月20日正式开张)\"},\"id\":1421903048609897305,\"memo\":\"{\\\"手机号\\\":\\\"17674105280\\\",\\\"宿舍楼号\\\":\\\"4-2-601\\\",\\\"门牌号\\\":\\\"4-2-601\\\",\\\"留言\\\":\\\"\\\"}\",\"num\":1,\"quotaNum\":0,\"realPay\":200,\"skuDTO\":{\"currentPrice\":200,\"imageUrl\":\"https://img.yzcdn.cn/upload_files/2017/12/05/FvfocHd14iFJngKMYDXNg6gPB6Sw.jpg\",\"name\":\"美的滚筒水洗洗衣(一桶)(12月20日正式开张)\",\"originPrice\":200,\"skuCode\":\"\",\"skuCompositeId\":{\"goodsId\":401183273,\"skuId\":36177240},\"skuMap\":\"[]\",\"type\":\"COMMON\"},\"snapShot\":\"a04ea8cbf54a79b21fdbd90f3b96e5cf\",\"tags\":{}}],\"orderNo\":\"E20171220165132017400010\",\"orderStatus\":\"WAIT_PAY\",\"orderType\":\"NORMAL\",\"outBizNo\":\"E20171220165132017400010\",\"payId\":\"\",\"payType\":0,\"payTypeEnum\":\"MIXED\",\"phase\":1,\"priceDTO\":{\"currentPrice\":200,\"originPrice\":200,\"postage\":0,\"promotionAmount\":0,\"totalPrice\":200},\"sellerDTO\":{\"kdtId\":40042638,\"shopId\":50042638,\"shopName\":\"自助上门洗衣\",\"shopType\":\"NORMAL\",\"teamType\":\"WSC\"},\"sentTime\":1513759892790,\"source\":\"{\\\"appScheme\\\":\\\"\\\",\\\"bookKey\\\":\\\"201712201651255a3a248de920128885\\\",\\\"clientIp\\\":\\\"43.250.200.109\\\",\\\"fromThirdApp\\\":false,\\\"hasUnvalidGoods\\\":0,\\\"isOnlineOrder\\\":true,\\\"isReceiveMsg\\\":1,\\\"kdtId\\\":40042638,\\\"orderMark\\\":\\\"\\\",\\\"platform\\\":\\\"weixin\\\",\\\"seller\\\":\\\"\\\",\\\"source\\\":\\\"\\\",\\\"track\\\":\\\"\\\",\\\"userAgent\\\":\\\"Mozilla/5.0 (Linux; Android 6.0; Le X620 Build/HEXCNFN5902606111S; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043508 Safari/537.36 MicroMessenger/6.5.23.1180 NetType/4G Language/zh_CN\\\"}\",\"tags\":{\"MESSAGE_NOTIFY\":true,\"IS_SECURED_TRANSACTIONS\":true,\"STOCK_DEDUCTED\":true},\"updateTime\":1513759892671}";

    public void testParse() throws Exception {
        OrderCreateParserV2 orderCreateParserV2 = new OrderCreateParserV2();
        Order order = orderCreateParserV2.parse(JSON.parseObject(testStr));
        System.out.println(JSON.toJSONString(order, SerializerFeature.PrettyFormat));
    }
}