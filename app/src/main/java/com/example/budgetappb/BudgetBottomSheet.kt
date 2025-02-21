import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.budgetappb.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BudgetBottomSheet : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_budget_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnClose: Button = view.findViewById(R.id.btnClose)
        btnClose.setOnClickListener {
            dismiss() // Closes the bottom sheet
        }
    }
}
