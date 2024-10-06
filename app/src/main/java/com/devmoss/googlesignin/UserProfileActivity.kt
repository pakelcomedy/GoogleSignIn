package com.devmoss.googlesignin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

class UserProfileActivity : AppCompatActivity() {

    private lateinit var textViewName: TextView
    private lateinit var textViewEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        // Inisialisasi TextView
        textViewName = findViewById(R.id.text_view_name)
        textViewEmail = findViewById(R.id.text_view_email)

        // Mendapatkan akun Google yang masuk
        val account: GoogleSignInAccount? = GoogleSignIn.getLastSignedInAccount(this)
        if (account != null) {
            // Tampilkan nama dan email pengguna
            textViewName.text = "Nama: ${account.displayName}"
            textViewEmail.text = "Email: ${account.email}"
        }
    }
}
