# Generated by Django 5.0.6 on 2024-06-24 22:22

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Order',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('order_id', models.CharField(default='', max_length=100)),
                ('member_id', models.CharField(default='', max_length=100)),
                ('order_name', models.CharField(default='', max_length=200)),
                ('order_price', models.DecimalField(decimal_places=0, default=0, max_digits=10)),
            ],
        ),
    ]
