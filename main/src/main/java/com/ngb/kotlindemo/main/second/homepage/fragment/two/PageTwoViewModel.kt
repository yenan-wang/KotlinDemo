package com.ngb.kotlindemo.main.second.homepage.fragment.two

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class PageTwoViewModel : ViewModel() {

    val mTemplateListLiveData = MutableLiveData<MutableList<TemplateData>>()
    private val mTemplateDataList = mutableListOf<TemplateData>()

    fun getData() {
        GlobalScope.launch {
            initData()
            delay(1000) // 模拟网络请求
            mTemplateListLiveData.postValue(mTemplateDataList)
        }
    }

    private fun initData() {
        //for (i in 0..20) {
            val data = TemplateData(
                "1675810545678",
                PageConstants.TEMPLATE_16_9,
                "16:9的尺寸",
                "这是一个示例描述",
                "南瓜饼",
                "02144632",
                5,
                1000L,
                500L,
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic.jj20.com%2Fup%2Fallimg%2F911%2F101416132957%2F161014132957-9.jpg&refer=http%3A%2F%2Fpic.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635758300&t=f29c273a5fd653eb41df28bb3a7a49fe",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202003%2F04%2F20200304155940_eaCVw.thumb.1000_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852360&t=92c06b35ace9f4121f4228d887700230",
                System.currentTimeMillis()
            )
            val data1 = TemplateData(
                "1675810545678",
                PageConstants.TEMPLATE_9_16,
                "9:16的尺寸",
                "这是一个示例描述",
                "南瓜饼",
                "02144632",
                5,
                1000L,
                500L,
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fww2.sinaimg.cn%2Fmw690%2F003Ruflbgy1gtvpcad0vfj61o03lyqb602.jpg&refer=http%3A%2F%2Fwww.sina.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852712&t=ec3f3de90008d12e234e8ab395be6bd1",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.zhimg.com%2F50%2Fv2-4bb8cceacff6613df968ba3d54b45d8d_hd.jpg&refer=http%3A%2F%2Fpic1.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852622&t=105bd92327c5263e2a56a942c90b8cbe",
                System.currentTimeMillis()
            )
            val data2 = TemplateData(
                "1675810545678",
                PageConstants.TEMPLATE_1_1,
                "1:1的尺寸",
                "这是一个示例描述",
                "南瓜饼",
                "02144632",
                5,
                1000L,
                500L,
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fdingyue.ws.126.net%2F2019%2F1219%2F596422bfj00q2rjdq003wc200r300k0g00r300k0.jpg&refer=http%3A%2F%2Fdingyue.ws.126.net&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852524&t=e4f4689dccd0cd4e995ff72825ed4fb0",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic2.zhimg.com%2F50%2Fv2-e043c1e5001ec01a6ef3f9bb4a07d720_hd.jpg&refer=http%3A%2F%2Fpic2.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852360&t=b2b3147aa12a5b1a5bb6b2d5a078218f",
                System.currentTimeMillis()
            )
            val data3 = TemplateData(
                "1675810545678",
                PageConstants.TEMPLATE_4_3,
                "4:3的尺寸",
                "这是一个示例描述",
                "南瓜饼",
                "02115832",
                85,
                512L,
                20L,
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F1712%2F144-1G209191R5.jpg&refer=http%3A%2F%2Fuploads.5068.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852569&t=516893929fb8dbc22d3d54630c0b263e",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F50a5e3fa7feb094a0f9cf644d9231e1b3fa2cfb3133bb-XF2bdj_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852622&t=48867715ad978d0f31a764a5d4307d81",
                System.currentTimeMillis()
            )

            val data4 = TemplateData(
                "1675810545678",
                PageConstants.TEMPLATE_3_4,
                "3:4的尺寸",
                "这是一个示例描述",
                "南瓜饼",
                "02144632",
                5,
                1000L,
                500L,
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwx1.sinaimg.cn%2Fmw690%2F006b0IMQly1gttdt7wj17j31671kwqjp.jpg&refer=http%3A%2F%2Fwx1.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852712&t=c96ac129fa3f3b1bc149490ddc7fea6c",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201610%2F04%2F20161004161302_VreQT.jpeg&refer=http%3A%2F%2Fb-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635852622&t=55017fdfee9f2c2c43b9507312e17069",
                System.currentTimeMillis()
            )
            mTemplateDataList.add(data)
            mTemplateDataList.add(data1)
            mTemplateDataList.add(data2)
            mTemplateDataList.add(data3)
            mTemplateDataList.add(data4)
        }
    //}
}