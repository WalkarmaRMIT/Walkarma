package walkarma.walkarma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.games.leaderboard.Leaderboard;

public class dashboard extends AppCompatActivity {

    private Button mProfile, mMap, mWeeklyReport,mLeaderboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mProfile = (Button) findViewById(R.id.Profile);
        mMap = (Button) findViewById(R.id.Map);
        mWeeklyReport = (Button) findViewById(R.id.WeeklyReport);
        mLeaderboard = (Button) findViewById(R.id.Leaderboard);

        mProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, Profile.class);
                startActivity(intent);
            }
        });
        mMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, MainMap.class);
                startActivity(intent);
            }
        });
        mWeeklyReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, WeeklyReport.class);
            }
        });
        mLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, Leaderboard.class);
                startActivity(intent);
            }
        });
        }
        }