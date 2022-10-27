package nhim.hi.myfoodquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What is the name of the Vietnam food shown in the image",
            R.drawable.mi_quang, "Bún đậu", "Phở Bò",
            "Mì Quảng", "Bánh đa cua", 3
        )

        questionList.add(que1)

        val que2 = Question(
            2, "What is the name of the VIetnam food shown  in the image",
            R.drawable.banh_cuon, "Bánh Cuốn", "Bùn diêu cua", "Cơm Rang",
            "Nem chua rán", 1
        )

        questionList.add(que2)

        val que3 = Question(
            3, "What is the name of the VIetnam food shown in the image",
            R.drawable.xoi_xeo, "Bánh Cuốn", "Xôi xéo", "Thịt kho tàu",
            "Nem chua rán", 2
        )

        questionList.add(que3)

        val que4 = Question(
            4, "What is the name of the VIetnam food shown in the image",
            R.drawable.pho_bo, "Bánh chưng rán", "Bún Riêu", "Thịt kho tàu",
            "Phở Bò", 4
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What is the name of the VIetnam food shown in the image",
            R.drawable.banh_bot_loc, "Mì Quảng", "Bánh Bột Lọc", "Thịt kho tàu",
            "Xúc xích", 2
        )

        questionList.add(que5)

        val que6 = Question(
            6, "What is the name of the VIetnam food shown in the image",
            R.drawable.banh_mi, "Bánh xèo", "Mì vàn thắn", "Thịt kho tàu",
            "Bánh Mì", 4
        )

        questionList.add(que6)

        val que7 = Question(
            7, "What is the name of the VIetnam food shown in the image",
            R.drawable.nem, "Bánh gối", "Phở Bò", "Nem cua bể",
            "Bánh Mì", 3
        )

        questionList.add(que7)

        val que8 = Question(
            5, "What is the name of the VIetnam food shown in the image",
            R.drawable.banh_bot_loc, "Mì Quảng", "Bánh Bột Lọc", "Thịt kho tàu",
            "Xúc xích", 2
        )

        questionList.add(que8)

        val que9 = Question(
            5, "What is the name of the VIetnam food shown in the image",
            R.drawable.bun_bo_hue, "Bún bò Huế", "Mì Quảng", "Bánh Mì",
            "Xúc xích", 1
        )

        questionList.add(que9)




        return questionList

    }

}