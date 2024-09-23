def display_len(fav_song):
    print(f"Your favorite song length is {len(fav_song)}")

def display_sliced_text(fav_song, start_slice_num, end_slice_num):
    print(f"The selecting text is {fav_song[start_slice_num:end_slice_num]}")

fav_song = str(input("Enter your favorite song: "))
display_len(fav_song)

start_slice_num = int(input("Starting slice number: "))
end_slice_num = int(input("Ending slice number: "))
if start_slice_num > end_slice_num \
    or start_slice_num > len(fav_song):
    print("Incorrect number!")
else:
    display_sliced_text(fav_song, start_slice_num, end_slice_num)