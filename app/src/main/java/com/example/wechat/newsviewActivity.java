package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class newsviewActivity extends AppCompatActivity {

    private ListView liebiao;
private RadioButton dibu1, dibu2,dibu3,dibu4;
private RadioGroup mdibu;
private Spinner mtiaanjia;
private TextView mtextss;
    ListView mListView;

    LinearLayout mLinearLayout;
    ArrayList<messages> messages= new ArrayList();
    ArrayList<faxianz> faxianz= new ArrayList();
    ArrayList<lianxiren> lianxiren= new ArrayList();
    ArrayList<news> news= new ArrayList();
    ArrayList<xialaliebiao> xialaliebiao =new ArrayList ();




    String stringArray1[] = {"张三", "张四", "张五","张六","张七","张八","张九","张十","张十一","张十二","张十三","张十四","张十五","张十六"};
    String stringArray1_2[] = {"到家了", "上班了", "没钱！","刚分手。。。",
            "想回家","考上驾照了","上课呢！","考个满分","加油！！","终究是我一个人抗下了所有","上游戏！"
            ,"借点钱","吃不起饭了","晚安"};
    String stringArray1_3[] = {"17:00", "17:00", "17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00"};
    int stringArray1_1[] = {R.drawable.man4,R.drawable.jintianjia ,R.drawable.nv5 ,R.drawable.biaoqing,R.drawable.gongzhongh,
            R.drawable.nv1,R.drawable.man1,R.drawable.nv2,R.drawable.man2,R.drawable.nv3,R.drawable.man3,R.drawable.nv4,R.drawable.man4,
            R.drawable.nv5,R.drawable.man5,R.drawable.nv1};

    String stringArray2[] = {"新的朋友", "仅聊天的朋友", "群聊","标签","公众号","张八","张九","张十","张十一","张十二","张十三","张十四","张十五","张十六"};
    int stringArray2_1[] = {R.drawable.tianjia2,R.drawable.jintianjia ,R.drawable.faqiqunliao ,R.drawable.biaoqing,R.drawable.gongzhongh,
            R.drawable.nv1,R.drawable.man1,R.drawable.nv2,R.drawable.man2,R.drawable.nv3,R.drawable.man3,R.drawable.nv4,R.drawable.man4,
            R.drawable.nv5,R.drawable.man5,R.drawable.nv1};

    String stringArray3[] = {"朋友圈", "扫一扫", "摇一摇","看一看","搜一搜","附近的人","购物","游戏","小程序"};
    int stringArray3_1[] = {R.drawable.penyouquan,R.drawable.saoyisao ,R.drawable.yaoyiyao ,R.drawable.kanyikan,R.drawable.souyisou,
            R.drawable.fijinren,R.drawable.gouwu,R.drawable.game,R.drawable.xiaochengxu};


    String stringArray4[] = {"支付", "收藏", "相册","卡包","表情","设置"};
    int stringArray4_1[] = {R.drawable.weixinzhifu,R.drawable.shoucang ,R.drawable.xiangce ,R.drawable.kabao,R.drawable.biaoqing,R.drawable.shezhi};

//    String stringArray0[]={"发起群聊","添加朋友","扫一扫","收付款","帮助与反馈"};
//    int stringArray0_1[]={R.drawable.faqiqunliao,R.drawable.tianjia,R.drawable.saoyisao,R.drawable.shoufukuan,R.drawable.help};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_newsview);

//        initData0();
//        initview0();

        initview1();
        initData1();

        initview2();
        initData2();

        initview3();
        initData3();

        initview ();
        initData ();


//        xialaliebiao.add (new xialaliebiao ("发起群聊",R.drawable.faqiqunliao));
//        xialaliebiao.add (new xialaliebiao ("添加朋友",R.drawable.tianjia));
//        xialaliebiao.add (new xialaliebiao ("扫一扫",R.drawable.saoyisao));
//        xialaliebiao.add (new xialaliebiao ("收付款",R.drawable.shoufukuan));
//        xialaliebiao.add (new xialaliebiao ("帮助与反馈",R.drawable.help));


        liebiao=findViewById (R.id.liebiao);
        liebiao.setAdapter (new Adapter (newsviewActivity.this,news));

//        mtiaanjia=findViewById (R.id.texttj);
//
//        mtiaanjia.setAdapter (new Adapter5 (newsviewActivity.this,xialaliebiao));
//

        mtextss = findViewById (R.id.textss);
        mtextss.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsviewActivity.this,sousuoActivity.class);
                startActivity(intent);
            }
        });
//mtiaanjia.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
//
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
//});
////        liebiao.setAdapter (new Adapter (this));
        mdibu=findViewById (R.id.dibu);
        dibu1=findViewById (R.id.dibu1);
        dibu2=findViewById (R.id.dibu2);
        dibu3=findViewById (R.id.dibu3);
        dibu4=findViewById (R.id.dibu4);
        mdibu.setOnCheckedChangeListener (new RadioGroup.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                if (checkedId==dibu1.getId ()){
                    liebiao.setAdapter (new Adapter (newsviewActivity.this,news));
                    mListView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            for (int i=0;i<= position;i++){
                                Intent intent = new Intent(newsviewActivity.this,xiaoxiActivity.class);
                                startActivity(intent);
                                break;
                            }
                            Toast.makeText(newsviewActivity.this, "进入和"+stringArray1[position]+"的聊天", Toast.LENGTH_SHORT).show();

                        }
                    });
                }else if (checkedId==dibu2.getId ()){
                    liebiao.setAdapter (new Adapter2 (newsviewActivity.this,lianxiren));
                    mListView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            for (int i=0;i<= position;i++){

                                Intent intent = new Intent(newsviewActivity.this,xiaoxiActivity.class);
                                startActivity(intent);
                                break;
                            }
                            Toast.makeText(newsviewActivity.this, "进入和"+stringArray2[position]+"的聊天", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else if (checkedId==dibu3.getId ()){
                    liebiao.setAdapter (new Adapter3 (newsviewActivity.this,faxianz));
                    mListView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                           switch (position){
                               case 0:
                                   Intent intent = new Intent(newsviewActivity.this,pengyouquanActivity.class);
                                   startActivity(intent);
                                   break;
                               case 1:
                                   Intent intent1 = new Intent(newsviewActivity.this,saoyisaoActivity.class);
                                   startActivity(intent1);
                                   break;
                               case 2:
                                   Intent intent2 = new Intent(newsviewActivity.this,yaoyiyaoActivity.class);
                                   startActivity(intent2);
                                   break;
                               case 3:
                                   Intent intent3 = new Intent(newsviewActivity.this,kanyikanActivity.class);
                                   startActivity(intent3);
                                   break;
                               case 4:
                                   Intent intent4 = new Intent(newsviewActivity.this,souyisouActivity.class);
                                   startActivity(intent4);
                                   break;
                               case 5:
                                   Intent intent5 = new Intent(newsviewActivity.this,fujinrenActivity.class);
                                   startActivity(intent5);
                                   break;
                               case 6:
                                   Intent intent6 = new Intent(newsviewActivity.this,gouwuActivity.class);
                                   startActivity(intent6);
                                   break;
                               case 7:
                                   Intent intent7 = new Intent(newsviewActivity.this,gameActivity.class);
                                   startActivity(intent7);
                                   break;
                               case 8:
                                   Intent intent8 = new Intent(newsviewActivity.this,xiaochengxuActivity.class);
                                   startActivity(intent8);
                                   break;
                           }
                        }
                    });
                }
                else if (checkedId==dibu4.getId ()){
                    liebiao.setAdapter (new Adapter4 (newsviewActivity.this,messages));
                    mListView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                    Intent intent = new Intent(newsviewActivity.this,zhifuActivity.class);
                                    startActivity(intent);
                                    break;
                                    case 1:
                                        Intent intent1 = new Intent(newsviewActivity.this,soucangActivity.class);
                                        startActivity(intent1);
                                        break;
                                    case 2:
                                        Intent intent2 = new Intent(newsviewActivity.this,xiangceActivity.class);
                                        startActivity(intent2);
                                        break;
                                    case 3:
                                        Intent intent3 = new Intent(newsviewActivity.this,kabaoActivity.class);
                                        startActivity(intent3);
                                        break;
                                    case 4:
                                        Intent intent4 = new Intent(newsviewActivity.this,biaoqingActivity.class);
                                        startActivity(intent4);
                                        break;
                                    case 5:
                                        Intent intent5 = new Intent(newsviewActivity.this,shezhiActivity.class);
                                        startActivity(intent5);
                                        break;
                                }

                            Toast.makeText(newsviewActivity.this, "我终于找到你了......", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });
    }


//    private void initData0() {
//        mListViewdata1();
//    }
//
//    private void mListViewdata0() {
//        for (int i=0;i<stringArray0.length;i++){
//            xialaliebiao.add (new xialaliebiao (stringArray0[i],stringArray0_1[i]));
//        }
//        Adapter5 adapter5 = new Adapter5 (this,xialaliebiao);
//        mListView.setAdapter (adapter5);
//    }
//    private void initview0() {
//        mtiaanjia=findViewById (R.id.texttj);
//    }


    private void initData1() {
        mListViewdata1();
    }

    private void mListViewdata1() {
        for (int i=0;i<stringArray1.length;i++){
            news.add (new news (stringArray1[i],stringArray1_3[i],stringArray1_2[i],stringArray1_1[i]));
        }
        Adapter adapter = new Adapter (this, news);
        mListView.setAdapter (adapter);
    }
    private void initview1() {
        mListView=findViewById (R.id.liebiao);
    }



    private void initData2() {
        mListViewdata2();
    }
    private void mListViewdata2() {
        for (int i=0;i<stringArray2.length;i++){
            lianxiren.add (new lianxiren (stringArray2[i],stringArray2_1[i]));
        }
        Adapter2 adapter2 = new Adapter2 (this, lianxiren);
        mListView.setAdapter (adapter2);
    }
    private void initview2() {
        mListView=findViewById (R.id.liebiao);
    }



    private void initData3() {
        mListViewdata3();
    }
    private void mListViewdata3() {
        for (int i=0;i<stringArray3.length;i++){
            faxianz.add (new faxianz (stringArray3[i],stringArray3_1[i]));
        }
        Adapter3 adapter3 = new Adapter3 (this, faxianz);
        mListView.setAdapter (adapter3);
    }
    private void initview3() {
        mListView=findViewById (R.id.liebiao);
    }


    private void initData() {
        mListViewdata();
    }
    private void mListViewdata() {

        for (int i=0;i<stringArray4.length;i++){
            messages.add (new messages (stringArray4[i],stringArray4_1[i]));
        }
        Adapter4 adapter = new Adapter4 (this, messages);
        mListView.setAdapter (adapter);
    }
    private void initview() {
        mListView=findViewById (R.id.liebiao);
    }

}



