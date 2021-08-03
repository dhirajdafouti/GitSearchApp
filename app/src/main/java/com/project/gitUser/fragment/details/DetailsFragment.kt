package com.project.gitUser.fragment.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.gitUser.databinding.FragmentDetailsBinding
import com.project.gitUser.fragment.base.BaseFragment


class DetailsFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        val binding = FragmentDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this

        val userData = DetailsFragmentArgs.fromBundle(arguments!!).userData

        binding.userdata = userData

        binding.openWeb.setOnClickListener {
                userData.web_url.let { web_url ->
                    val intent = android.content.Intent(
                        android.content.Intent.ACTION_VIEW,
                        android.net.Uri.parse(web_url)
                    )
                   context?.startActivity(intent)
                }

        }

        return binding.root
    }


}
