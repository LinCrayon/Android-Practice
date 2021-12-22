package com.lsq.myappcom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

/**
 * linshengqian
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setIcon(R.drawable.bg1);
                alertDialog.setTitle("删除警告");
                alertDialog.setMessage("确定删除吗？");
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(MainActivity.this, "我的点击的否", Toast.LENGTH_SHORT).show();
                    }
                });


                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(MainActivity.this, "我的点击的是", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();

                Button btn2 = (Button) findViewById(R.id.btn2);
                btn2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String[] arrList= new String[]{"关注","推荐","k8s"};
                   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                   builder.setIcon(R.drawable.bg1);
                   builder.setTitle("请选择频道");
                   builder.setItems(arrList, new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           Toast.makeText(MainActivity.this, "我选择了"+arrList[which],Toast.LENGTH_SHORT).show();
                           switch (arrList[which]){
                               case "关注":

                                   break;
                               case "推荐":

                                   break;
                               default:
                                   break;
                           }

                       }
                   });
                           builder.create().show();
               }
           });
                Button btn3 = (Button)findViewById(R.id.btn3);
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String[] arrVote = new String[]{"科比","史密斯","乔丹"};
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("请选择你最喜欢的明星");
                        builder.setSingleChoiceItems(arrVote, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        builder.create().show();

                    }
                });

           Button btn4 =(Button) findViewById(R.id.btn4);
           btn4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   final boolean[] checkArr = new boolean[]{false,false,true,false,true};
                   String[] arrInter = new  String[]{"游泳","上网","旅游","爬山"};
                   Context context;
                   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                   builder.setIcon(R.drawable.bg1);
                   builder.setTitle("请输入你的兴趣爱好");
                   builder.setMultiChoiceItems(arrInter, checkArr, new DialogInterface.OnMultiChoiceClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                         checkArr[which]=isChecked;

                       }
                   });
                   builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int which) {
                           String result ="";
                           for (int i = 0; i < arrInter.length; i++) {
                               result+= arrInter[i]+"";
                           }
                           if (!"".equals(result)){
                               Toast.makeText(MainActivity.this,"你选择的是："+result,Toast.LENGTH_SHORT).show();
                           }
                       }
                   });
                   builder.create().show();

               }
           });





            }
        });
    }
}