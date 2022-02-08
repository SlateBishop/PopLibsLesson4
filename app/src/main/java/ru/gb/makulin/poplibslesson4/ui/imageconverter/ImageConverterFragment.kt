package ru.gb.makulin.poplibslesson4.ui.imageconverter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gb.makulin.poplibslesson4.databinding.FragmentImageConverterBinding

class ImageConverterFragment : MvpAppCompatFragment(), ImageConverterView {

    private val presenter by moxyPresenter {
        ImageConverterPresenter()
    }

    private var _binding: FragmentImageConverterBinding? = null
    private val binding: FragmentImageConverterBinding
        get() = _binding!!

    companion object {
        fun newInstance() = ImageConverterFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImageConverterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initButton()
    }

    private fun initButton() {
        binding.convertJpgToPngBtn.setOnClickListener {
            presenter.onConvertBtnClicked()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}