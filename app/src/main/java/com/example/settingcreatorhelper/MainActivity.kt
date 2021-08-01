package com.example.settingcreatorhelper

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jamgu.settingpie.base.SettingViewBinder
import com.example.settingcreatorhelper.databinding.ActivityMainBinding
import com.jamgu.settingpie.demo.PieTestActivity
import com.jamgu.settingpie.model.CheckBoxProp
import com.jamgu.settingpie.model.LayoutProp
import com.jamgu.settingpie.model.SetConstants.VIEW_TYPE_CHECKBOX
import com.jamgu.settingpie.model.SetConstants.VIEW_TYPE_CUSTOM
import com.jamgu.settingpie.model.SetConstants.VIEW_TYPE_NORMAL
import com.jamgu.settingpie.model.SetConstants.VIEW_TYPE_TEXT_TITLE
import com.jamgu.settingpie.model.SetItemBuilder
import com.jamgu.settingpie.model.SetListBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        val adapter = SetListBuilder(binding.recycler)
                .showDecoration(true)
                .arrowOfTheme(false)
                .decorationOfGroup(16)
                .addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("角色动作", textColor = "#999999").hintText("攻击")
                            .layoutProp(LayoutProp {
                                Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                            })
                            .hintIcon("https://q.qlogo.cn/qqapp/1104466820/2480FDF9E6072E6536CE5FF7B946674F/100")
                            .mainIcon("https://q.qlogo.cn/qqapp/1104466820/2480FDF9E6072E6536CE5FF7B946674F/100")
                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                            .hintIcon("http://img.daimg.com/uploads/allimg/210729/3-210H92301020-L.jpg")
                            .mainIcon(R.drawable.ic_launcher_background)

                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_TEXT_TITLE).mainText("端游角色卡设置", 14, "#999999")
                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_CHECKBOX).mainText("展示外观")
                            .checkBoxProp(CheckBoxProp(true, 50) { _, isChecked ->
                                Toast.makeText(this@MainActivity, "check box clicked = $isChecked", Toast.LENGTH_SHORT)
                                        .show()
                            })

                            .layoutProp(LayoutProp {
                                Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this@MainActivity, PieTestActivity::class.java))
                            })
                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_CUSTOM)
                            .viewBinder(SettingViewBinder(R.layout.setting_normal_item_layout_2) { holder, _ ->
                                val name = holder.itemView.findViewById<TextView>(R.id.setting_name)
                                name.text = "推荐好友"
                                holder.itemView.findViewById<TextView>(R.id.setting_hint).text = "lian_yi"
                            }).layoutProp(LayoutProp {
                                Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                            })
                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_CUSTOM)
                            .viewBinder(SettingViewBinder(R.layout.setting_normal_item_layout_2) { holder, _ ->
                                val name = holder.itemView.findViewById<TextView>(R.id.setting_name)
                                name.text = "推荐好友"
                                holder.itemView.findViewById<TextView>(R.id.setting_hint).text = "lian_yi"
                            }).layoutProp(LayoutProp {
                                Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                            })
                }.addGroupItems {
                    ArrayList<SetItemBuilder>().apply {
                        add(
                            SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                                    .hintIcon("http://img.daimg.com/uploads/allimg/210729/3-210H92301020-L.jpg")
                                    .mainIcon(R.drawable.default_img_placeholder)
                        )
                        add(
                            SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                                    .hintIcon("http://img.daimg.com/uploads/allimg/210729/3-210H92301020-L.jpg", 16)
                                    .mainIcon(R.drawable.default_img_placeholder)
                        )
                        add(
                            SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                                    .showArrow(true)
                                    .mainIcon(R.drawable.default_img_placeholder)
                        )
                        add(
                            SetItemBuilder().viewType(VIEW_TYPE_CHECKBOX).mainText("展示外观")
                                    .checkBoxProp(CheckBoxProp(true, 50) { _, isChecked ->
                                        Toast.makeText(
                                            this@MainActivity,
                                            "check box clicked = $isChecked",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    })
                                    .layoutProp(LayoutProp {
                                        Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                                    })
                        )
                        add(
                            SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                                    .mainIcon(R.drawable.default_img_placeholder)
                        )
                    }
                }.addItem {
                    SetItemBuilder().viewType(VIEW_TYPE_NORMAL).mainText("光效").hintText("九幽冥火")
                            .hintIcon("http://img.daimg.com/uploads/allimg/210729/3-210H92301020-L.jpg")
                            .mainIcon(R.drawable.default_img_placeholder)
                }.addGroupItem {
                    SetItemBuilder().viewType(VIEW_TYPE_CHECKBOX).mainText("展示外观")
                            .checkBoxProp(CheckBoxProp(true, 50) { _, isChecked ->
                                Toast.makeText(this@MainActivity, "check box clicked = $isChecked", Toast.LENGTH_SHORT)
                                        .show()
                            })
                            .layoutProp(LayoutProp {
                                Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()
                            })
                }.build()

    }
}