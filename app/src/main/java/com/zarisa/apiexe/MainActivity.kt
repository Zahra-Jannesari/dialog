package com.zarisa.apiexe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import com.zarisa.apiexe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
    TestCustomDialogFragment.NoticeDialogListener {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.outlinedButton.setOnClickListener { showNoticeDialog() }

    }
    fun showNoticeDialog() {
        val dialog = TestCustomDialogFragment()
        dialog.show(supportFragmentManager, "NoticeDialogFragment")
    }

    override fun onDialogPositiveClick(dialog: DialogFragment) {
        Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()
    }

    override fun onDialogNegativeClick(dialog: DialogFragment) {
        Toast.makeText(this,"no",Toast.LENGTH_SHORT).show()

    }
}