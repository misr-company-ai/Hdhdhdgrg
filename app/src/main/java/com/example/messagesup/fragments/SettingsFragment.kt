package com.example.messagesup.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.messagesup.R
import com.example.messagesup.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDeveloper.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://omarabdelazizbe.vercel.app/")))
        }

        binding.btnTerms.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("الشروط والأحكام")
                .setMessage("هنا شروط الاستخدام الخاصة بالتطبيق.")
                .setPositiveButton("حسنا", null)
                .show()
        }

        binding.btnAbout.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("عن التطبيق")
                .setMessage("Messages Up v1.0\nتطبيق رسائل بسيط.")
                .setPositiveButton("حسنا", null)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
