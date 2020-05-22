package com.example.trainingdesign.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.trainingdesign.Adapters.CardAdapter;
import com.example.trainingdesign.Adapters.CollectionAdapter;
import com.example.trainingdesign.Adapters.Fe2atAdapter;
import com.example.trainingdesign.Adapters.StoreAdapter;
import com.example.trainingdesign.Database;
import com.example.trainingdesign.Models.CollectionModel;
import com.example.trainingdesign.Models.Fe2atModel;
import com.example.trainingdesign.R;

public class Category extends AppCompatActivity implements CollectionAdapter.ItemCollectionListener, Fe2atAdapter.ItemCardListener {

    ImageView imageView;
    RecyclerView CategoryRecycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        imageView = findViewById(R.id.category_image);
        CategoryRecycle = findViewById(R.id.category_recycle);

        int catposition = getIntent().getIntExtra("position", 0);
        if (catposition==0)
        {
            CategoryRecycle.setAdapter(new CollectionAdapter(Database.getCommCollections(), new CollectionAdapter.ItemCollectionListener() {
                @Override
                public void onItemSelected(int position, CollectionModel collectionModel) {
                    if (position == 0)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getSTCCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==1)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getMobilyCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==2)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getZainCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==3)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getLebaraCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==4)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getVirginCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==5)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getFriendiCommCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }

                }
            }));
            imageView.setImageResource(R.drawable.mob);
        }else if (catposition==1)
        {
            CategoryRecycle.setAdapter(new CollectionAdapter(Database.getDataCollections(), new CollectionAdapter.ItemCollectionListener() {
                @Override
                public void onItemSelected(int position, CollectionModel collectionModel) {
                    if (position == 0)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getSTCDataCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==1)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getZainDataCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==2)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getZainDataCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==3)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getLebaraDataCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }else if (position==4)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getFriendiDataCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }

                }
            }));
            imageView.setImageResource(R.drawable.matrix);

        }else if (catposition==2)
        {
            CategoryRecycle.setAdapter(new StoreAdapter(Database.getStores(), new StoreAdapter.ItemStoreListener() {
                @Override
                public void onItemSelected(int position) {

                    if (position == 0 )
                    {
                     CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getSaudiItunesCards(), new Fe2atAdapter.ItemCardListener() {
                         @Override
                         public void onCardBought(Fe2atModel cardModel) {
                             Toast.makeText(Category.this, "انت اشتريت يبشه من ايتونز", Toast.LENGTH_SHORT).show();
                         }

                         @Override
                         public void onCardAddedToWishList(Fe2atModel cardModel) {
                             Toast.makeText(Category.this, "تم اضافه الى المفضله", Toast.LENGTH_SHORT).show();
                         }
                     }));
                    }else if (position ==1 )
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getAmericanItunesCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه من ايتونز الامريكى", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم اضافه الى المفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));


                    }


                }
            }));
            imageView.setImageResource(R.drawable.gd_itunes);
        }else if (catposition==3)
        {
            CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getGooglePlayCards(), new Fe2atAdapter.ItemCardListener() {
                @Override
                public void onCardBought(Fe2atModel cardModel) {
                    Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onCardAddedToWishList(Fe2atModel cardModel) {
                    Toast.makeText(Category.this, "تم الاضافه الى المفضله", Toast.LENGTH_SHORT).show();
                }
            }));
            imageView.setImageResource(R.drawable.gp);
        }else if (catposition==4)
        {
            CategoryRecycle.setAdapter(new CollectionAdapter(Database.getGamesCollections(), new CollectionAdapter.ItemCollectionListener() {
                @Override
                public void onItemSelected(int position, CollectionModel collectionModel) {
                    if (position ==0)
                    {
                        CategoryRecycle.setAdapter(new StoreAdapter(Database.getStores(), new StoreAdapter.ItemStoreListener() {
                            @Override
                            public void onItemSelected(int position) {
                                if (position == 0)
                                {
                                    CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getSaudiPlaystationCards(), new Fe2atAdapter.ItemCardListener() {
                                        @Override
                                        public void onCardBought(Fe2atModel cardModel) {
                                            Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                                        }

                                        @Override
                                        public void onCardAddedToWishList(Fe2atModel cardModel) {
                                            Toast.makeText(Category.this, "تم اضافه الى الفضله", Toast.LENGTH_SHORT).show();

                                        }
                                    }));
                                }else if (position == 1 )
                                {
                                    CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getAmericanPlaystationCards(), new Fe2atAdapter.ItemCardListener() {
                                        @Override
                                        public void onCardBought(Fe2atModel cardModel) {
                                            Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                                        }

                                        @Override
                                        public void onCardAddedToWishList(Fe2atModel cardModel) {
                                            Toast.makeText(Category.this, "تم اضافه الى الفضله", Toast.LENGTH_SHORT).show();

                                        }
                                    }));
                                }
                            }
                        }));

                    }else if (position ==1)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getXboxCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم اضافه الى الفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));

                    }else if (position ==2)
                    {
                        CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getSteamCards(), new Fe2atAdapter.ItemCardListener() {
                            @Override
                            public void onCardBought(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCardAddedToWishList(Fe2atModel cardModel) {
                                Toast.makeText(Category.this, "تم اضافه الى الفضله", Toast.LENGTH_SHORT).show();
                            }
                        }));
                    }
                }
            }));
            imageView.setImageResource(R.drawable.g);
        }else if (catposition==5)
        {
            CategoryRecycle.setAdapter(new Fe2atAdapter(getApplicationContext(), Database.getServicesCards(), new Fe2atAdapter.ItemCardListener() {
                @Override
                public void onCardBought(Fe2atModel cardModel) {
                    Toast.makeText(Category.this, "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onCardAddedToWishList(Fe2atModel cardModel) {
                    Toast.makeText(Category.this, "تم اضافه الى الفضله", Toast.LENGTH_SHORT).show();
                }
            }));
            imageView.setImageResource(R.drawable.bg_services);
        }


        CategoryRecycle.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }

    public void back(View view)
    {
        onBackPressed();
    }

    @Override
    public void onItemSelected(int position, CollectionModel collectionModel) {

    }

    @Override
    public void onCardBought(Fe2atModel cardModel) {

    }

    @Override
    public void onCardAddedToWishList(Fe2atModel cardModel) {

    }
}
