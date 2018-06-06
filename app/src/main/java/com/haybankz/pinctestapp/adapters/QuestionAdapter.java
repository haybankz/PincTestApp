package com.haybankz.pinctestapp.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.haybankz.pinctestapp.R;
import com.haybankz.pinctestapp.models.Question;
import com.haybankz.pinctestapp.models.Sentiment;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {


    private Context mContext;
    private List<Question> mQuestions;

    public QuestionAdapter(FragmentActivity mContext, List<Question> questions){
        super();
        this.mContext = mContext;
        mQuestions = questions;

    }

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);

        return new QuestionViewHolder(mContext, itemView);
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {

        Question question = mQuestions.get(position);


        holder.tvQues.setText(question.getAttributes().getText());

        holder.tvAuthor.setText(question.getAttributes().getAuthorInfo().getNickname());


//        holder.happyBtn.setText("3");
//        holder.offendedBtn.setText("2");
//        holder.curiousBtn.setText("1");

//        holder.curiousBtn.setSelected(true);
//        holder.happyBtn.setPressed(true);
        List<Sentiment> sentiments = question.getAttributes().getSentiments();
        if (sentiments != null) {
            for (Sentiment s : sentiments) {
                switch (s.getId()) {
                    case 2:
                        holder.happyBtn.setText(String.valueOf(s.getCount()));
                        break;

                    case 3:
                        holder.curiousBtn.setText(String.valueOf(s.getCount()));
                        break;

                    case 4:
                        holder.cryingBtn.setText(String.valueOf(s.getCount()));
                        break;

                    case 5:
                        holder.offendedBtn.setText(String.valueOf(s.getCount()));
                        break;

                    default:
                        break;


                }
            }
        }

        String emoji = question.getAttributes().getCurrentUserSentimentId();
        if (emoji != null) {
            switch (emoji) {
                case "2":
                    holder.happyBtn.setSelected(true);
                    break;
                case "3":
                    holder.curiousBtn.setSelected(true);
                    break;
                case "4":
                    holder.cryingBtn.setSelected(true);
                    break;
                case "5":
                    holder.offendedBtn.setSelected(true);
                    break;

                default:
                    break;

            }
        }

        holder.reportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "To report post", Toast.LENGTH_SHORT).show();
            }
        });

        holder.shareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "To share post", Toast.LENGTH_SHORT).show();
            }
        });

        holder.tvComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "To comment on post", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return mQuestions.size();
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder{

        TextView tvQues;
        TextView tvAuthor;
        Button happyBtn, curiousBtn, offendedBtn, cryingBtn;
        TextView tvPosted, tvCommentedBy, tvReport, tvShare, tvComment;

        ImageView imgOne, imgTwo, imgThree;
        TextView tvOne;

        LinearLayout reportLayout, shareLayout;



        public QuestionViewHolder(Context context, View itemView) {
            super(itemView);
            tvQues = (TextView) itemView.findViewById(R.id.tv_question);
            tvAuthor = (TextView) itemView.findViewById(R.id.tv_author);

            happyBtn = (Button) itemView.findViewById(R.id.btn_happy);
            happyBtn.setCompoundDrawables(getDrawable(context, R.drawable.happy, happyBtn.getLineHeight()), null, null, null);

            curiousBtn = (Button) itemView.findViewById(R.id.btn_curious);
            curiousBtn.setCompoundDrawables(getDrawable(context, R.drawable.curious, curiousBtn.getLineHeight()), null, null, null);

            offendedBtn = (Button) itemView.findViewById(R.id.btn_offended);
            offendedBtn.setCompoundDrawables(getDrawable(context, R.drawable.offended, offendedBtn.getLineHeight()), null, null, null);

            cryingBtn = (Button) itemView.findViewById(R.id.btn_crying);
            cryingBtn.setCompoundDrawables(getDrawable(context, R.drawable.crying, cryingBtn.getLineHeight()), null, null, null);

            tvPosted = (TextView) itemView.findViewById(R.id.tv_posted);
            tvCommentedBy = (TextView) itemView.findViewById(R.id.tv_commented_by);
            tvReport = (TextView) itemView.findViewById(R.id.tv_report);
            tvShare = (TextView) itemView.findViewById(R.id.tv_share);
            tvComment = (TextView) itemView.findViewById(R.id.tv_comment);

            imgOne = (ImageView) itemView.findViewById(R.id.img_one);
            imgTwo = (ImageView) itemView.findViewById(R.id.img_two);
            imgThree = (ImageView) itemView.findViewById(R.id.img_three);
            tvOne = (TextView) itemView.findViewById(R.id.tv_one);

            reportLayout = (LinearLayout) itemView.findViewById(R.id.layout_report);
            shareLayout = (LinearLayout) itemView.findViewById(R.id.layout_share);



            Typeface fontHeavy = Typeface.createFromAsset(mContext.getAssets(), "Avenir-Heavy.ttf");
            Typeface fontMedium = Typeface.createFromAsset(mContext.getAssets(), "Avenir-Medium.ttf");

            happyBtn.setTypeface(fontHeavy);
            curiousBtn.setTypeface(fontHeavy);
            offendedBtn.setTypeface(fontHeavy);
            cryingBtn.setTypeface(fontHeavy);

            tvQues.setTypeface(fontHeavy);
            tvAuthor.setTypeface(fontHeavy);

            tvPosted.setTypeface(fontMedium);
            tvCommentedBy.setTypeface(fontMedium);

            tvReport.setTypeface(fontHeavy);
            tvShare.setTypeface(fontHeavy);
            tvComment.setTypeface(fontHeavy);

            tvOne.setTypeface(fontHeavy);




        }
    }

    private Drawable getDrawable(Context context, int resourceId, int lineHeight){
        Drawable drawable = ContextCompat.getDrawable(context, resourceId);
        int pixelDrawableSize = (int) Math.round(lineHeight * 1.2);
        drawable.setBounds(0, 0, pixelDrawableSize, pixelDrawableSize);

        return drawable;
    }
}
