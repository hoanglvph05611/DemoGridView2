package com.lvh.demogridview;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<HinhAnh> arrayList = new ArrayList<>();
    boolean isLoading = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        data();

        recyclerViewAdapter = new RecyclerViewAdapter(arrayList,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        initScrollListener();

    }

    public void data(){
        arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-9-1.jpg","hot girl1"));
        arrayList.add(new HinhAnh("https://ss-images.catscdn.vn/2018/06/10/2968571/34689401_2147325555551794_7654281988110548992_n.jpg","hot girl2"));
        arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20190408/84947430634_20190408001343.jpg","hot girl3"));
        arrayList.add(new HinhAnh("https://www.baodatviet.com/wp-content/uploads/2019/02/gai-xinh-lop-11-gay-bao-cong-dong-mang-vi-buc-anh-chup-len-trong-61682c.jpg","hot girl3"));
        arrayList.add(new HinhAnh("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg","hot girl5"));
        arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-2k-8.jpg","hot girl6"));
        arrayList.add(new HinhAnh("https://i.pinimg.com/originals/87/ca/28/87ca286d3e0e292823d65671f4386112.jpg","hot girl7"));
        arrayList.add(new HinhAnh("https://i.pinimg.com/originals/b9/d7/da/b9d7da269c609496652d89408a3e3fd3.jpg","hot girl8"));
        arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20180628/0934120310_20180628212321.jpg","hot girl9"));
        arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/22/503303783758588765283886517969469929684992n-1553273205434457806164.jpg","hot girl10"));
        arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/30/5552996523744881227864901254380808370651136n-15536720733391270751674-1553963221242603418149.jpg","hot girl11"));
        arrayList.add(new HinhAnh("https://i.pinimg.com/736x/91/06/21/9106217e59456dbc2593f74737f119c6.jpg","hot girl12"));
        arrayList.add(new HinhAnh("http://images.plurk.com/3hGh0LACePTOpxlAWNAA.jpg","hot girl13"));
        arrayList.add(new HinhAnh("https://2sao.vietnamnetjsc.vn/images/2019/03/26/22/43/u23-viet-nam-06.jpg","hot girl14"));
        arrayList.add(new HinhAnh("http://afamilycdn.com/2018/11/25/photo-3-15431567235461032558642.jpg","hot girl15"));
        arrayList.add(new HinhAnh("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_aEcDJAN4Viy9dKUgH5j4Bihuyld47UGifzq8eHj_OzfuKy14","hot girl16"));
//        arrayList.add(new HinhAnh("https://upload.wikimedia.org/wikipedia/commons/d/d3/Midu_-_Summer_2012_%28Explored_1_-_May_24th%29_cropped.jpg","hot girl17"));
//        arrayList.add(new HinhAnh("https://toplist.vn/images/800px/vung-dat-co-con-gai-xinh-nhat-tai-viet-nam-67017.jpg","hot girl18"));
//        arrayList.add(new HinhAnh("https://www.hutech.edu.vn/imgnews/ttvhnt/huyen1%285%29.jpg","hot girl19"));
//        arrayList.add(new HinhAnh("https://photo2.tinhte.vn/data/attachment-files/2018/04/4293477_GirlXinh_Part5_137.jpg","hot girl20"));

//        arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-9-1.jpg","hot girl1"));
//        arrayList.add(new HinhAnh("https://ss-images.catscdn.vn/2018/06/10/2968571/34689401_2147325555551794_7654281988110548992_n.jpg","hot girl2"));
//        arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20190408/84947430634_20190408001343.jpg","hot girl3"));
//        arrayList.add(new HinhAnh("https://www.baodatviet.com/wp-content/uploads/2019/02/gai-xinh-lop-11-gay-bao-cong-dong-mang-vi-buc-anh-chup-len-trong-61682c.jpg","hot girl3"));
//        arrayList.add(new HinhAnh("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg","hot girl5"));
//        arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-2k-8.jpg","hot girl6"));
//        arrayList.add(new HinhAnh("https://i.pinimg.com/originals/87/ca/28/87ca286d3e0e292823d65671f4386112.jpg","hot girl7"));
//        arrayList.add(new HinhAnh("https://i.pinimg.com/originals/b9/d7/da/b9d7da269c609496652d89408a3e3fd3.jpg","hot girl8"));
//        arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20180628/0934120310_20180628212321.jpg","hot girl9"));
//        arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/22/503303783758588765283886517969469929684992n-1553273205434457806164.jpg","hot girl10"));
//        arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/30/5552996523744881227864901254380808370651136n-15536720733391270751674-1553963221242603418149.jpg","hot girl11"));
//        arrayList.add(new HinhAnh("https://i.pinimg.com/736x/91/06/21/9106217e59456dbc2593f74737f119c6.jpg","hot girl12"));
//        arrayList.add(new HinhAnh("http://images.plurk.com/3hGh0LACePTOpxlAWNAA.jpg","hot girl13"));
//        arrayList.add(new HinhAnh("https://2sao.vietnamnetjsc.vn/images/2019/03/26/22/43/u23-viet-nam-06.jpg","hot girl14"));
//        arrayList.add(new HinhAnh("http://afamilycdn.com/2018/11/25/photo-3-15431567235461032558642.jpg","hot girl15"));
//        arrayList.add(new HinhAnh("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_aEcDJAN4Viy9dKUgH5j4Bihuyld47UGifzq8eHj_OzfuKy14","hot girl16"));
//        arrayList.add(new HinhAnh("https://upload.wikimedia.org/wikipedia/commons/d/d3/Midu_-_Summer_2012_%28Explored_1_-_May_24th%29_cropped.jpg","hot girl17"));
//        arrayList.add(new HinhAnh("https://toplist.vn/images/800px/vung-dat-co-con-gai-xinh-nhat-tai-viet-nam-67017.jpg","hot girl18"));
//        arrayList.add(new HinhAnh("https://www.hutech.edu.vn/imgnews/ttvhnt/huyen1%285%29.jpg","hot girl19"));
//        arrayList.add(new HinhAnh("https://photo2.tinhte.vn/data/attachment-files/2018/04/4293477_GirlXinh_Part5_137.jpg","hot girl20"));
    }

    private void initScrollListener() {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

                if (!isLoading) {
                    int totalItem = linearLayoutManager.getItemCount();
                    int lastItem = linearLayoutManager.findLastVisibleItemPosition();
                    int threshHold = 1;
                    if (linearLayoutManager != null && totalItem <= lastItem + threshHold) {
                        //bottom of list!
                        loadMore();
                        isLoading = true;
                    }
                }
            }
        });
    }

    private void loadMore() {
        arrayList.add(null);
        recyclerViewAdapter.notifyItemInserted(arrayList.size() - 1);

        // Handler Là một đối Android cung cấp dùng để liên kết
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                arrayList.remove(arrayList.size() - 1);
                int scrollPosition = arrayList.size();

                recyclerViewAdapter.notifyItemRemoved(scrollPosition); // Thông báo khi dữ liệu ở 1 vị trí bị gỡ bỏ
                int currentSize = scrollPosition;
                int nextLimit = currentSize + 1;

                while (currentSize - 1 < nextLimit) {
                    arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-9-1.jpg","hot girl1"));
                    arrayList.add(new HinhAnh("https://ss-images.catscdn.vn/2018/06/10/2968571/34689401_2147325555551794_7654281988110548992_n.jpg","hot girl2"));
                    arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20190408/84947430634_20190408001343.jpg","hot girl3"));
                    arrayList.add(new HinhAnh("https://www.baodatviet.com/wp-content/uploads/2019/02/gai-xinh-lop-11-gay-bao-cong-dong-mang-vi-buc-anh-chup-len-trong-61682c.jpg","hot girl3"));
                    arrayList.add(new HinhAnh("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg","hot girl5"));
                    arrayList.add(new HinhAnh("https://danongonline.com.vn/wp-content/uploads/2018/02/anh-girl-xinh-2k-8.jpg","hot girl6"));
                    arrayList.add(new HinhAnh("https://i.pinimg.com/originals/87/ca/28/87ca286d3e0e292823d65671f4386112.jpg","hot girl7"));
                    arrayList.add(new HinhAnh("https://i.pinimg.com/originals/b9/d7/da/b9d7da269c609496652d89408a3e3fd3.jpg","hot girl8"));
                    arrayList.add(new HinhAnh("http://media2.sieuhai.tv:8088/onbox/images/user_lead_image/20180628/0934120310_20180628212321.jpg","hot girl9"));
                    arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/22/503303783758588765283886517969469929684992n-1553273205434457806164.jpg","hot girl10"));
                    arrayList.add(new HinhAnh("https://kenh14cdn.com/2019/3/30/5552996523744881227864901254380808370651136n-15536720733391270751674-1553963221242603418149.jpg","hot girl11"));
                    arrayList.add(new HinhAnh("https://i.pinimg.com/736x/91/06/21/9106217e59456dbc2593f74737f119c6.jpg","hot girl12"));
                    arrayList.add(new HinhAnh("http://images.plurk.com/3hGh0LACePTOpxlAWNAA.jpg","hot girl13"));
                    arrayList.add(new HinhAnh("https://2sao.vietnamnetjsc.vn/images/2019/03/26/22/43/u23-viet-nam-06.jpg","hot girl14"));
                    arrayList.add(new HinhAnh("http://afamilycdn.com/2018/11/25/photo-3-15431567235461032558642.jpg","hot girl15"));
                    arrayList.add(new HinhAnh("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_aEcDJAN4Viy9dKUgH5j4Bihuyld47UGifzq8eHj_OzfuKy14","hot girl16"));
                    arrayList.add(new HinhAnh("https://upload.wikimedia.org/wikipedia/commons/d/d3/Midu_-_Summer_2012_%28Explored_1_-_May_24th%29_cropped.jpg","hot girl17"));
                    arrayList.add(new HinhAnh("https://toplist.vn/images/800px/vung-dat-co-con-gai-xinh-nhat-tai-viet-nam-67017.jpg","hot girl18"));
                    arrayList.add(new HinhAnh("https://www.hutech.edu.vn/imgnews/ttvhnt/huyen1%285%29.jpg","hot girl19"));
                    arrayList.add(new HinhAnh("https://photo2.tinhte.vn/data/attachment-files/2018/04/4293477_GirlXinh_Part5_137.jpg","name"));
                    currentSize++;
                }

                recyclerViewAdapter.notifyDataSetChanged();
                isLoading = false;
            }
        }, 1500);


    }

}
