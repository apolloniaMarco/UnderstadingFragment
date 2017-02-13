package deltagv2.apollonia.marco.evolvethefuture.understadingfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by marco on 28/04/2016.
 */
public class ArticleFragment extends Fragment {

    private String message;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view =inflater.inflate(R.layout.article_view, container, false);
        return view;
        }
    }